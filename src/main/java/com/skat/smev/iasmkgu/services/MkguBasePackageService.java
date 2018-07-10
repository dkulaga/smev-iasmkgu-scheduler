package com.skat.smev.iasmkgu.services;

import com.skat.smev.iasmkgu.domain.db.views.BaseMkguPacketsView;
import com.skat.smev.iasmkgu.domain.db.views.MkguFormInfo;
import com.skat.smev.iasmkgu.domain.db.views.MkguIds;

import java.util.Date;
import java.util.List;

public interface MkguBasePackageService {

    List<BaseMkguPacketsView> findPackagesByIdKeyAndMkguId(int id_key, String id_mkgu );

    List<String> findAllMkguIdsFromPackets(Date dateFrom, Date dateTo);

    List<MkguIds> findPacketsByIdMkguGroupByIdKey(String id_mkgu, Date dateFrom, Date dateTo);

    List<MkguFormInfo> findPacketsByIdMkguAndIdKey(String id_mkgu, int id_key);
}
