/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bossbattlemi.model;

import java.util.Objects;

/**
 *
 * @author vishnukdawah
 */
public class Move {
    
int moveId; 
String moveName;
String moveType;
int movePower;
int moveDescription;

    public int getMoveId() {
        return moveId;
    }

    public void setMoveId(int moveId) {
        this.moveId = moveId;
    }

    public String getMoveName() {
        return moveName;
    }

    public void setMoveName(String moveName) {
        this.moveName = moveName;
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = moveType;
    }

    public int getMovePower() {
        return movePower;
    }

    public void setMovePower(int movePower) {
        this.movePower = movePower;
    }

    public int getMoveDescription() {
        return moveDescription;
    }

    public void setMoveDescription(int moveDescription) {
        this.moveDescription = moveDescription;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.moveId;
        hash = 67 * hash + Objects.hashCode(this.moveName);
        hash = 67 * hash + Objects.hashCode(this.moveType);
        hash = 67 * hash + this.movePower;
        hash = 67 * hash + this.moveDescription;
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
        final Move other = (Move) obj;
        if (this.moveId != other.moveId) {
            return false;
        }
        if (this.movePower != other.movePower) {
            return false;
        }
        if (this.moveDescription != other.moveDescription) {
            return false;
        }
        if (!Objects.equals(this.moveName, other.moveName)) {
            return false;
        }
        if (!Objects.equals(this.moveType, other.moveType)) {
            return false;
        }
        return true;
    }


    
}
