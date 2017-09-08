package nl.davidstranders.spring5recipebook.services;

import nl.davidstranders.spring5recipebook.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
