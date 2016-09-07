public class MazeWalker
{
    public void walkMaze(MazeBot mazeBot){
        while(mazeBot.didNotReachGoal()){
            if(mazeBot.canMoveForward()){
                mazeBot.moveForward();
            }
            else if(!mazeBot.canMoveForward()){
                mazeBot.turnLeft();
                if(!mazeBot.canMoveForward()){
                    mazeBot.turnRight();
                    mazeBot.turnRight();
                }
            }    
        }
        if(mazeBot.didReachGoal()){
            mazeBot.signalSuccess();
        }
        else{
            mazeBot.signalError();
        }
    }
}
