/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eel.seprphase2.Simulator.FailureModel;

import eel.seprphase2.Simulator.FailureModel.FailableComponent;
import eel.seprphase2.Simulator.FailureModel.FailureState;
import eel.seprphase2.Simulator.PhysicalModel.Reactor;
import eel.seprphase2.Simulator.PhysicalModel.Turbine;
import eel.seprphase2.Utilities.Percentage;
import eel.seprphase2.Utilities.Pressure;
import eel.seprphase2.Utilities.Temperature;
import org.jmock.auto.Mock;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import static eel.seprphase2.Utilities.Units.*;
import org.junit.Ignore;
import static org.hamcrest.Matchers.*;

/**
 *
 * @author Yazidi
 */
public class FailableComponentTest {
    
   
    
   
    
    
    
    public FailableComponentTest() {
    }
    
    @Test
    public void shouldInitializeReactorComponentStateToNotFailed() {
        
        FailableComponent reactor;
        reactor = new Reactor();
        assertFalse(reactor.hasFailed());
    }
    
    @Test
    public void shouldSetReactorFailedStateToFailed() {
        FailableComponent reactor;
        reactor = new Reactor();
        reactor.fail();
        assertTrue(reactor.hasFailed());
    }
    
    @Test
    public void shouldInitializeReactorWearTo0() {
        FailableComponent reactor = new Reactor();
        reactor.getWear();
        assertEquals(percent(0), reactor.getWear());
    }
    
    
    @Test
    public void shouldInitializeTurbineComponentStateToNotFailed() {
        FailableComponent turbine;
        turbine = new Turbine();
        assertFalse(turbine.hasFailed());
    }
    
    @Test
    public void shouldSetTurbineFailedStateToFailed() {
        FailableComponent turbine;
        turbine = new Turbine();
        turbine.fail();
        assertTrue(turbine.hasFailed());
    }
    
     @Test
    public void shouldInitializeTurbineWearTo0() {
        FailableComponent turbine = new Turbine();
        turbine.getWear();
        assertEquals(percent(0), turbine.getWear());
    }
     

    @Test @Ignore
    public void shouldIncreaseWearOfReactorWhenRunning() {
        Reactor reactor = new Reactor(new Percentage(100), new Percentage(100),
                                      new Temperature(400), new Pressure(101325));
        reactor.step();
        assertThat(reactor.getWear().ratio(), greaterThan(0.0));
    }
    
    @Test
    public void shouldIncreaseWearOfTurbineWhenRunning() {
        Turbine turbine = new Turbine();
        turbine.step();
        assertThat(turbine.getWear().ratio(), greaterThan(0.0));
    }
    
    @Test @Ignore
    public void shouldNotIncreaseWearOver100() {
        Reactor reactor = new Reactor(new Percentage(100), new Percentage(100),
                                      new Temperature(400), new Pressure(101325));
        Turbine turbine = new Turbine();
        
        for (int i = 0; i < 150; i++) {
            reactor.step();
            turbine.step();
        }
        assertEquals(percent(100), reactor.getWear());
        assertEquals(percent(100), turbine.getWear());
    }
}