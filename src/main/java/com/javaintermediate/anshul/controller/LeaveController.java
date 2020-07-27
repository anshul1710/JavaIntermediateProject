package com.javaintermediate.anshul.controller;

import com.javaintermediate.anshul.AnshulApplication;
import com.javaintermediate.anshul.modal.Leavess;
import com.javaintermediate.anshul.service.LeaveService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * <h1>Controller of the Leave Api Project</h1>
 * In this file all APIs are defined for leave management
 *
 * @author Anshul Gandotra
 */
@ApiModel
@RestController
public class LeaveController {

private static final Logger LOGGER= LogManager.getLogger(AnshulApplication.class);
    @Autowired
    LeaveService leaveService;

    @ApiOperation(value = "Add leave", notes="used to add new leaves",nickname = "enter leave")
    @PostMapping("/leave")
    public boolean addLeave(@RequestBody Leavess leavess) {
        LOGGER.info("Api to create new Leave");
        try {
            leaveService.addLeave(leavess);
            LOGGER.info("leave created");
            return true;

        }
        catch (Exception e)
        {
         LOGGER.info("Error occured while adding new Leave");
         return false;
        }
    }


    @ApiOperation(value = "get leave", notes="used to get all leaves",nickname = "get all leave")
    @GetMapping("/leave")
    public List<Leavess> getAllLeaves()
    {
        LOGGER.info("Api to create new Leave");
        try {
            List<Leavess> list= leaveService.getLeaveList();
            LOGGER.info("Getting list successfull");
            return list;
        }
        catch (Exception e)
        {
            LOGGER.info("exception occured while getting list");
            return null;
        }
    }


    @ApiOperation(value = "get leave of particular type", notes="used to get leaves of particular leave")
    @GetMapping("/leave/{type}")
    public List<Leavess> findByType(@PathVariable String type)
    {
        LOGGER.info("Api to get all leaves of particular leave type");
        try {
            List<Leavess> list= leaveService.findLeaveWithType(type);
            LOGGER.info("List of particular type fetched successfully");
            return list;
        }
       catch (Exception e)
       {
           LOGGER.info("Error occured while fetching leaves of particular type");
           return null;
       }
    }


    @ApiOperation(value = "delete leave", notes="used to delete leaves",nickname = "delete leave leave")
    @DeleteMapping("/leave/{leaveid}")
   public String deleteLeave(@PathVariable int leaveid)
    {
        LOGGER.info("delete leave");
        try {
            String s= leaveService.deleteLeavve(leaveid);
            LOGGER.info("leave deleted successfully");
            return s;
        }
       catch (Exception e)
       {
           LOGGER.info("error occured while deleting");
           return null;
       }
    }

    @ApiOperation(value = "update leave", notes="used edit particular leaves",nickname = "edit leave")
    @PutMapping("/leave/{leaveid}")
    public Leavess editLeave(@RequestBody Leavess leavess,@PathVariable int leaveid) {
        LOGGER.info("Api to update a leave with id");
        try {
            Leavess leavess1= leaveService.editLeave(leavess,leaveid);
            LOGGER.info("successfully updated leave");
            return leavess1;
        }
       catch (Exception e)
       {
           LOGGER.info("error occured while updating list");
           return null;
       }
    }
}
