/*
 * Copyright (c) 2017 Kevin Herron
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.html.
 */

package org.eclipse.milo.opcua.sdk.client.model.nodes.variables;

import java.util.concurrent.CompletableFuture;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.model.types.variables.TransitionVariableType;
import org.eclipse.milo.opcua.stack.core.types.builtin.DateTime;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;

public class TransitionVariableNode extends BaseDataVariableNode implements TransitionVariableType {
    public TransitionVariableNode(OpcUaClient client, NodeId nodeId) {
        super(client, nodeId);
    }

    public CompletableFuture<PropertyNode> getIdNode() {
        return getPropertyNode(TransitionVariableType.ID);
    }

    public CompletableFuture<?> getId() {
        return getProperty(TransitionVariableType.ID);
    }

    public CompletableFuture<StatusCode> setId(Object value) {
        return setProperty(TransitionVariableType.ID, value);
    }

    public CompletableFuture<PropertyNode> getNameNode() {
        return getPropertyNode(TransitionVariableType.NAME);
    }

    public CompletableFuture<QualifiedName> getName() {
        return getProperty(TransitionVariableType.NAME);
    }

    public CompletableFuture<StatusCode> setName(QualifiedName value) {
        return setProperty(TransitionVariableType.NAME, value);
    }

    public CompletableFuture<PropertyNode> getNumberNode() {
        return getPropertyNode(TransitionVariableType.NUMBER);
    }

    public CompletableFuture<UInteger> getNumber() {
        return getProperty(TransitionVariableType.NUMBER);
    }

    public CompletableFuture<StatusCode> setNumber(UInteger value) {
        return setProperty(TransitionVariableType.NUMBER, value);
    }

    public CompletableFuture<PropertyNode> getTransitionTimeNode() {
        return getPropertyNode(TransitionVariableType.TRANSITION_TIME);
    }

    public CompletableFuture<DateTime> getTransitionTime() {
        return getProperty(TransitionVariableType.TRANSITION_TIME);
    }

    public CompletableFuture<StatusCode> setTransitionTime(DateTime value) {
        return setProperty(TransitionVariableType.TRANSITION_TIME, value);
    }

    public CompletableFuture<PropertyNode> getEffectiveTransitionTimeNode() {
        return getPropertyNode(TransitionVariableType.EFFECTIVE_TRANSITION_TIME);
    }

    public CompletableFuture<DateTime> getEffectiveTransitionTime() {
        return getProperty(TransitionVariableType.EFFECTIVE_TRANSITION_TIME);
    }

    public CompletableFuture<StatusCode> setEffectiveTransitionTime(DateTime value) {
        return setProperty(TransitionVariableType.EFFECTIVE_TRANSITION_TIME, value);
    }
}
