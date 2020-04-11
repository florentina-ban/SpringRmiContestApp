package services;

import domain.Participant;
import domain.ParticipantDTO;

public interface IContestObserver {
   void participantAdded(ParticipantDTO participantDTO) throws ContestException;
   void participantRemoved(ParticipantDTO participantDTO) throws ContestException;
}
