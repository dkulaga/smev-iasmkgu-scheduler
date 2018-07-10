package com.skat.smev.iasmkgu.util;

import com.skat.smev.iasmkgu.model.events.EventsResponse;

/**
 *  Класс для преобразования json-запроса в xml о схеме вида сведений
 */
public class IasmkguRequestTransformer {

   /**
     * Метод преобразования ответа от сервиса
     * @param xml тело xml-ответа
     * @return возвращает сущность ответа необходимого вида сведений
     * @throws Exception
     */
    public EventsResponse parseContent(String xml)
            throws Exception {
        return XmlUtil.unmarshal(xml, EventsResponse.class);
    }
}
