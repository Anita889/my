package com.example.projectwork.services;

import com.example.projectwork.dtos.CardDto;
import com.example.projectwork.models.Card;

public interface CardService  {
    Card findByPincode(Long pincode);
    Card saveCard(CardDto cardDto);
}