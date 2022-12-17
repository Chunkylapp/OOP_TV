package pages;

import input.ActionsInput;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.node.ObjectNode;
import database.DataBase;

public interface PageInterface {

    public String getName();

    public ObjectNode action(final ActionsInput actions, final DataBase dataBase) throws JsonProcessingException;

}
