package services;

import domain.*;

import java.util.List;

public interface IContestService {
    void setClient(IContestObserver client);

    void login(User user, IContestObserver client) throws ContestException;
    void logOut(User user, IContestObserver client) throws ContestException;
    List<CategVarsta> getCategVarsta(Integer vasta) throws ContestException;
    List<Proba> getProbe(CategVarsta cat) throws ContestException;
    List<ParticipantDTO> getParticipanti(Proba proba) throws ContestException;
    void adaugaParticipant(ParticipantDTO participantDTO) throws ContestException;
    void stergeParticipant(ParticipantDTO participantDTO) throws ContestException;
}
