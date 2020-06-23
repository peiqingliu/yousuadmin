package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgAllStateFeedbackRepository;
import com.yousushare.modules.express.service.KdgAllStateFeedbackService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@AllArgsConstructor
public class KdgAllStateFeedbackServiceImpl implements KdgAllStateFeedbackService {

    private KdgAllStateFeedbackRepository kdgAllStateFeedbackRepository;

    @Override
    public KdgAllStateFeedbackRepository getRepository() {
        return kdgAllStateFeedbackRepository;
    }
}
