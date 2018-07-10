package com.skat.smev.iasmkgu.services;

import com.skat.smev.iasmkgu.repository.QualHistoryRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class QualHistoryService {

    private final QualHistoryRepository qualHistoryRepository;

    public QualHistoryService(QualHistoryRepository qualHistoryRepository) {
        this.qualHistoryRepository = qualHistoryRepository;
    }

    @Transactional
    public void updateHistoryByIdKeyAndIdOtdel(int id_key, int id_otdel){
        qualHistoryRepository.updateHistoryByIdKeyAndIdOtdel(id_key, id_otdel);
    }
}
