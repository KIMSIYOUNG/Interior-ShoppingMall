package com.bit.academy.service;

import com.bit.academy.model.CartVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface PaymentService {

    /**
     * 카트조회
     * @param m_no
     * @return
     */
    CartVO cartview(int m_no, HttpServletRequest request);

    /**
     * 카트담기
     * @param list
     */
    void goCart(List list);

}
