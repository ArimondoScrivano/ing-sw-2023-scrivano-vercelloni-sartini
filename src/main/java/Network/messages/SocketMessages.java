package Network.messages;

public enum SocketMessages {
    LOGIN_REQUEST, LOGIN_REPLY,PING_MESSAGE, NAME_FAILED, NAME_UPDATE, NEW_GAME, WAITING_FOR_OTHER_PLAYERS,
    WAITING_FOR_YOUR_TURN, JOIN_LOBBY, ADDED_TO_LOBBY,IS_GAME_STARTING,GAME_STARTING, IS_IT_MY_TURN,CHECK_YOUR_TURN, ARE_PARAMETERS_OK,

    MY_TURN,PARAMETERS_OK,PARAMETERS_KO, MY_TURN_ENDED, GAME_ENDING,HAVE_I_WON, WINNER, LOSER, DISCONNECT,

    //ASYNCRONOUS MESSAGE REQUESTS AND RESPONSES
    DASHBOARD_REQ,PERSONAL_GOAL_REQ,COMMONGOAL_REQ, SHELF_REQ, REFRESH_REQ,

    DASHBOARD_RES,PERSONAL_GOAL_RES,COMMONGOAL_RES, SHELF_RES, REFRESH_RES



    }
