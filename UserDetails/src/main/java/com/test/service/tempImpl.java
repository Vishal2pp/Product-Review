package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.tempDao;

@Service
public class tempImpl implements temp1{
@Autowired
private tempDao d;
}
