package com.javaintermediate.anshul.service;

import com.javaintermediate.anshul.modal.Leavess;
import com.javaintermediate.anshul.repository.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeaveService {


    @Autowired
    LeaveRepository leaveRepository;
    public Leavess addLeave(Leavess leavess) {
        return leaveRepository.save(leavess);
    }

    public List<Leavess> getLeaveList() {
        return leaveRepository.findAll();
    }

    public List<Leavess> findLeaveWithType(String type) {
    return leaveRepository.findAllByLeaveType(type);
    }

    public String deleteLeavve(int id) {
         leaveRepository.deleteById(id);
         return "\"deleted\"";
    }

    public Leavess editLeave(Leavess leavess,int id) {
        Leavess oldLeaves=leaveRepository.findByLeaveId(id);
        System.out.println(id);
        oldLeaves.setLeaveId(id);
        oldLeaves.setAppliedDate(leavess.getAppliedDate());
        oldLeaves.setEndDate(leavess.getEndDate());
        oldLeaves.setHalfDay(leavess.isHalfDay());
        oldLeaves.setLeaveType(leavess.getLeaveType());
        oldLeaves.setReason(leavess.getReason());
        oldLeaves.setStartDate(leavess.getStartDate());
        oldLeaves.setUpdatedDate(leavess.getUpdatedDate());
        oldLeaves.setStatus(leavess.getStatus());
        leaveRepository.saveAndFlush(oldLeaves);
       return oldLeaves;
    }
}
