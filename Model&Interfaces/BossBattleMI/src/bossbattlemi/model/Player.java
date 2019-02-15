/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bossbattlemi.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author vishnukdawah
 */
public class Player {
    
int personId; 
String playerName;
String playerType;
int playerMaxHP;
int playerHP;
int playerATK;
int playerDEF;
List<Move> listOfPlayerMoves = new ArrayList<>();
int playerPoints;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public int getPlayerMaxHP() {
        return playerMaxHP;
    }

    public void setPlayerMaxHP(int playerMaxHP) {
        this.playerMaxHP = playerMaxHP;
    }

    public int getPlayerHP() {
        return playerHP;
    }

    public void setPlayerHP(int playerHP) {
        this.playerHP = playerHP;
    }

    public int getPlayerATK() {
        return playerATK;
    }

    public void setPlayerATK(int playerATK) {
        this.playerATK = playerATK;
    }

    public int getPlayerDEF() {
        return playerDEF;
    }

    public void setPlayerDEF(int playerDEF) {
        this.playerDEF = playerDEF;
    }

    public List<Move> getListOfPlayerMoves() {
        return listOfPlayerMoves;
    }

    public void setListOfPlayerMoves(List<Move> listOfPlayerMoves) {
        this.listOfPlayerMoves = listOfPlayerMoves;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerPoints(int playerPoints) {
        this.playerPoints = playerPoints;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.personId;
        hash = 43 * hash + Objects.hashCode(this.playerName);
        hash = 43 * hash + Objects.hashCode(this.playerType);
        hash = 43 * hash + this.playerMaxHP;
        hash = 43 * hash + this.playerHP;
        hash = 43 * hash + this.playerATK;
        hash = 43 * hash + this.playerDEF;
        hash = 43 * hash + Objects.hashCode(this.listOfPlayerMoves);
        hash = 43 * hash + this.playerPoints;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.personId != other.personId) {
            return false;
        }
        if (this.playerMaxHP != other.playerMaxHP) {
            return false;
        }
        if (this.playerHP != other.playerHP) {
            return false;
        }
        if (this.playerATK != other.playerATK) {
            return false;
        }
        if (this.playerDEF != other.playerDEF) {
            return false;
        }
        if (this.playerPoints != other.playerPoints) {
            return false;
        }
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        if (!Objects.equals(this.playerType, other.playerType)) {
            return false;
        }
        if (!Objects.equals(this.listOfPlayerMoves, other.listOfPlayerMoves)) {
            return false;
        }
        return true;
    }
    

    
}
