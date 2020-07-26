package com.javaintermediate.anshul.repository;

import com.javaintermediate.anshul.modal.Leavess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaveRepository extends JpaRepository<Leavess, Integer> {
List<Leavess> findAllByLeaveType(String type);
Leavess findByLeaveId(int id);
}
