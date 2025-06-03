package org.example.Command;

import java.util.Stack;

    public class RemoteControl {
        private Stack<Command> commandStack =new Stack<>();

        public void pressButton(Command command){
            command.execute();
            commandStack.push(command);
        }
        public void pressUndo(){
            if(!commandStack.isEmpty()){
                Command lastCommand = commandStack.pop();
                lastCommand.undo();
            }
            else{
                System.out.println("Nothing undo");
            }
        }
    }
