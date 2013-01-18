package eel.seprphase2.FailureModel;

import eel.seprphase2.Utilities.Percentage;

/**
 * A FailableComponent is one that takes on wear/damage attributes. This class allows a component to adopt
 * a failure state and will accrue damage over time. The calculateWear delta must be overridden by any
 * child class that derives this
 * @author Marius Dumetrescu
 */
public abstract class FailableComponent {
    private FailureState failureState;      //The state of the component
    private Percentage wear;                //Current wear level - capped at 100%
        
    /**
     * Constructor for the FailableComponent. Sets default percentage to 0 and a normal FailureState
     */
    public FailableComponent()
    {
        //Initialize to a normal state
        failureState = FailureState.Normal;
        wear = new Percentage(0);
    }
    
    /**
     * getFailureState returns the component's failureState of type FailureState.
     * @return The current failure state of this FailableComponent
     */
    public FailureState getFailureState(){
        return this.failureState;
    }
    
    /**
     * setFailureState sets the component's failure state. Must of type FailureState.
     * @param newFailureState The new failure state that the component will adopt.
     */
    public void setFailureState(FailureState newFailureState){
        this.failureState=newFailureState;
    }

    /**
     * CalculateWearDelta must be overridden by any child classes. It should be used to calculate a minute
     * change in wear level for the component to be added onto it. This is normally calculated within a 
     * method's step() routine.
     * @return Percentage. The number of percentage points to add to the current wear level.
     */
    public abstract Percentage calculateWearDelta();

    /**
     * Returns the component's current wear level as a percentage.
     * @return The component's wear level.
     */
    public Percentage getWear() {
        return wear;
    }
    
    /**
     * setWear will increase the wear of the component from a delta value. The value will be capped at 100 and 0
     * @param wearDelta The number of percentage points to increase the FailableComponent's wear level by between 0 and 100
     */
    public void setWear(Percentage wearDelta)
    {
       if ((wear.points() + wearDelta.points()) < 100) {
            wear = wear.plus(wearDelta);
        }
       else {
            wear = new Percentage(100);     //Cap at 100%
        }
       if (wearDelta.points() == 0)
       {
           wear = new Percentage(0);        //Cap at 0%
       }
       
    }
}
