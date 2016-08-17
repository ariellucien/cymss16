/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomRules;

import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 *
 * @author administrador1
 */
public class TimeTestRule implements TestRule{
    @Override
    public Statement apply(Statement stmnt, Description d) {
        return new TimeStatement(stmnt);
    }           
}

class TimeStatement extends Statement
{
    private final Statement stmnt;    
    public TimeStatement(Statement stmnt) {
        this.stmnt = stmnt;
    }
    @Override
    public void evaluate() throws Throwable {
        long time = 0;
        try{
            time = System.currentTimeMillis();
            stmnt.evaluate();
        }
        finally
        {
            System.out.println("La prueba tardó " + (System.currentTimeMillis()-time));
        }
    }    
}