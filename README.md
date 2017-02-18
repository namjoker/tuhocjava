const fs = require("fs");
const login = require("facebook-chat-api");

// Simple echo bot. It will repeat everything that you say.
// Will stop when you say '/stop'

login({
    email: "namjoker@bmail.vn",
    password: "19071995"
}, function callback(err, api) {
    if (err) return console.error(err);

    api.setOptions({
        listenEvents: true
    });

    var stopListening = api.listen((err, event) => {
        if (err) return console.error(err);

        api.markAsRead(event.threadID, (err) => {
            if (err) console.error(err);
        });

        switch (event.type) {
            case "message":
                if (event.body === '/stop') {
                    api.sendMessage("Goodbye…", event.threadID);
                    return stopListening();
                }
                const request = require('request'),
                    url = 'http://www.simsimi.com/getRealtimeReq?uuid=UwmPMKoqosEETKleXWGOJ6lynN1TQq18wwvrmCy6IRt&lc=vi&ft=0&reqText=' + event.body

                request(url, (error, response, body) => {
                    if (!error && response.statusCode === 200) {
                        const fbResponse = JSON.parse(body)
                        api.sendMessage(fbResponse.respSentence, event.threadID);
                    }
                    else {
                        api.sendMessage("Em đang bị treo anh ơi.", event.threadID);
                    }
                })
                break;
            case "event":
                console.log(event);
                break;
        }
    });
});
