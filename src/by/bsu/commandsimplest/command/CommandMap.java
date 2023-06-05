package by.bsu.commandsimplest.command;

import java.util.EnumMap;

public class CommandMap {
   private EnumMap<CommandType, Command> map = new EnumMap<CommandType, Command>(CommandType.class){
       {
           this.put(CommandType.BLOCKING, new BlockingCommand());
           this.put(CommandType.CREDITING, new CreditingCommand());
           this.put(CommandType.WITHDRAWING, new WithdrawingCommand());
       }
   };
    private static CommandMap instance = new CommandMap();
    private CommandMap () {}
    public static CommandMap getInstance() {return instance;}
    public Command get(String cmdString) {
        CommandType key = CommandType.valueOf(CommandType.class, cmdString);
        return map.get(key);
    }
    public Command get(CommandType key) {
        return map.get(key);
    }

    public Command put(CommandType key, Command value) {
        return map.put(key, value);
    }

    public Command getOrDefault(CommandType key, Command defaultValue) {
        return map.getOrDefault(key, defaultValue);
    }

    public boolean remove(CommandType key, Object value) {
        return map.remove(key, value);
    }

    public Command replace(CommandType key, Command value) {
        return map.replace(key, value);
    }
}
