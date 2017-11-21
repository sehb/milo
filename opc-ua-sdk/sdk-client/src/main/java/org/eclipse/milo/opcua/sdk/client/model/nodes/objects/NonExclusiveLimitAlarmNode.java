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

package org.eclipse.milo.opcua.sdk.client.model.nodes.objects;

import java.util.concurrent.CompletableFuture;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.model.nodes.variables.TwoStateVariableNode;
import org.eclipse.milo.opcua.sdk.client.model.types.objects.NonExclusiveLimitAlarmType;
import org.eclipse.milo.opcua.sdk.client.nodes.UaVariableNode;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;

public class NonExclusiveLimitAlarmNode extends LimitAlarmNode implements NonExclusiveLimitAlarmType {
    public NonExclusiveLimitAlarmNode(OpcUaClient client, NodeId nodeId) {
        super(client, nodeId);
    }

    public CompletableFuture<TwoStateVariableNode> getActiveStateNode() {
        return getVariableComponent(QualifiedName.parse("0:ActiveState")).thenApply(TwoStateVariableNode.class::cast);
    }

    public CompletableFuture<LocalizedText> getActiveState() {
        return getActiveStateNode().thenCompose(UaVariableNode::getValue).thenApply(o -> cast(o, LocalizedText.class));
    }

    public CompletableFuture<StatusCode> setActiveState(LocalizedText value) {
        return getActiveStateNode().thenCompose(node -> node.setValue(value));
    }

    public CompletableFuture<TwoStateVariableNode> getHighHighStateNode() {
        return getVariableComponent(QualifiedName.parse("0:HighHighState")).thenApply(TwoStateVariableNode.class::cast);
    }

    public CompletableFuture<LocalizedText> getHighHighState() {
        return getHighHighStateNode().thenCompose(UaVariableNode::getValue).thenApply(o -> cast(o, LocalizedText.class));
    }

    public CompletableFuture<StatusCode> setHighHighState(LocalizedText value) {
        return getHighHighStateNode().thenCompose(node -> node.setValue(value));
    }

    public CompletableFuture<TwoStateVariableNode> getHighStateNode() {
        return getVariableComponent(QualifiedName.parse("0:HighState")).thenApply(TwoStateVariableNode.class::cast);
    }

    public CompletableFuture<LocalizedText> getHighState() {
        return getHighStateNode().thenCompose(UaVariableNode::getValue).thenApply(o -> cast(o, LocalizedText.class));
    }

    public CompletableFuture<StatusCode> setHighState(LocalizedText value) {
        return getHighStateNode().thenCompose(node -> node.setValue(value));
    }

    public CompletableFuture<TwoStateVariableNode> getLowStateNode() {
        return getVariableComponent(QualifiedName.parse("0:LowState")).thenApply(TwoStateVariableNode.class::cast);
    }

    public CompletableFuture<LocalizedText> getLowState() {
        return getLowStateNode().thenCompose(UaVariableNode::getValue).thenApply(o -> cast(o, LocalizedText.class));
    }

    public CompletableFuture<StatusCode> setLowState(LocalizedText value) {
        return getLowStateNode().thenCompose(node -> node.setValue(value));
    }

    public CompletableFuture<TwoStateVariableNode> getLowLowStateNode() {
        return getVariableComponent(QualifiedName.parse("0:LowLowState")).thenApply(TwoStateVariableNode.class::cast);
    }

    public CompletableFuture<LocalizedText> getLowLowState() {
        return getLowLowStateNode().thenCompose(UaVariableNode::getValue).thenApply(o -> cast(o, LocalizedText.class));
    }

    public CompletableFuture<StatusCode> setLowLowState(LocalizedText value) {
        return getLowLowStateNode().thenCompose(node -> node.setValue(value));
    }
}
