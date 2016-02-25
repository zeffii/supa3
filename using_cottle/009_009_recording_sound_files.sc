Server.internal.recSampleFormat = "int16"; // or Server.local
Server.internal.recChannels = 1; // for mono

// saves file in the SC folder, will be overwritten if repeated
Server.internal.prepareForRecord("audio1.aif");

// or saved in recordings folder of SC folder
Server.internal.prepareForRecord("recordings/audio1.aif");  // or saved in Music folder (replace students with your user name)

Server.internal.prepareForRecord("/Users/students/Music/audio1.aif");  // Then to record, don't use the button, but the following code.

// Before running these lines go back and start a previous example
// so you have something to record.
Server.internal.record;

// Then
Server.internal.stopRecording; 