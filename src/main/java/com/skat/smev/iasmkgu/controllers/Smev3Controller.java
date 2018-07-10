package com.skat.smev.iasmkgu.controllers;


import com.skat.smev.iasmkgu.domain.AdapterResponseModel;
import com.skat.smev.iasmkgu.services.Smev3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/iasmkgu")
public class Smev3Controller {


    @Autowired
    private Smev3Service smev3Service;


    /**
     * Метод для приема ответа от СМЭВ-адаптера, его парсинга и отправки в ВИС
     * @param adapterResponse модель ответа от СМЭВ-адаптера
     * @return сведения об успешной отправке либо об ошибке отправки
     * @throws Exception
     */
    @PostMapping("/response/send")
    public String sendConsumerResponse(@RequestBody AdapterResponseModel adapterResponse) throws Exception {
        return smev3Service.sendResponse(adapterResponse);
    }


}
