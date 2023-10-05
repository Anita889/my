package com.example.projectwork.services.impl;

import com.example.projectwork.dtos.CardDto;
import com.example.projectwork.models.Card;
import com.example.projectwork.models.Users;
import com.example.projectwork.repository.CardRepository;
import com.example.projectwork.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CardServiceIml implements CardService {
    private  CardRepository cardRepository;
    @Autowired
    public CardServiceIml(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }
    @Override
    public Card findByPincode(Long pincode) {
        return cardRepository.findByPincode(pincode);
    }

    @Override
    public Card saveCard(CardDto cardDto) {
        Card card=new Card();

        card.setId(cardDto.getId());
        card.setSurname(cardDto.getSurname());
        card.setName(cardDto.getName());
        card.setEmail(cardDto.getEmail());
        card.setPassword(cardDto.getPassword());

        card.setAccount(cardDto.getAccount());
        card.setPincode(cardDto.getPincode());
        card.setStart(cardDto.getStart());
        card.setFinish(cardDto.getFinish());
        card.setUser(cardDto.getUser());

        cardRepository.save(card);
        return card;
    }
}
