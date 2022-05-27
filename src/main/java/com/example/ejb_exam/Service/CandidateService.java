package com.example.ejb_exam.Service;

import com.example.ejb_exam.Entity.Candidates;
import com.example.ejb_exam.Repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {
    @Autowired
    public CandidateRepository candidateRepository;

    public Page<Candidates> findAll(int page, int limit){
        return candidateRepository.findAll(PageRequest.of(page,limit));
    }
    public Candidates save(Candidates candidates){
        return candidateRepository.save(candidates);
    }
}