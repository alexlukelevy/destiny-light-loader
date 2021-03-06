package uk.co.alexlevy.service;

import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public interface DestinyService {

    JsonNode getMembership(int membershipTypeId, String username) throws IOException;

    JsonNode getAccountSummary(int membershipTypeId, long membershipId) throws IOException;

    JsonNode getInventory(int membershipTypeId, long membershipId, long characterId) throws IOException;
}