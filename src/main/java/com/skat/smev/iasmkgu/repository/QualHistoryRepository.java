package com.skat.smev.iasmkgu.repository;

import com.skat.smev.iasmkgu.domain.db.views.QualHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface QualHistoryRepository extends JpaRepository<QualHistory, Long> {

    @Modifying
    @Query(value = "UPDATE QualHistory history SET sent = 1 WHERE id_key = :id_key AND id_otdel = :id_otdel")
    void updateHistoryByIdKeyAndIdOtdel(@Param("id_key") int id_key, @Param("id_otdel") int id_otdel);

}
