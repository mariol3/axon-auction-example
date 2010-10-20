/*
 * Copyright (c) 2010. Axon Auction Example
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fuin.auction.command.api;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.fuin.objects4j.Contract;

/**
 * Result of registering a new user.
 */
public final class RegisterUserCommandResult extends AbstractCommandResult {

	private static final long serialVersionUID = 7124123040949548640L;

	private String id;

	/**
	 * Default constructor.
	 */
	public RegisterUserCommandResult() {
		super();
	}

	/**
	 * Constructor with id.
	 * 
	 * @param id
	 *            Unique internal id of the user.
	 */
	public RegisterUserCommandResult(final String id) {
		super(CommandResultType.SUCCESS, 0, "");
		this.id = id;
		Contract.requireValid(this);
	}

	/**
	 * Returns the new UUID of the user.
	 * 
	 * @return Unique internal id of the user.
	 */
	public final String getId() {
		return id;
	}

	/**
	 * Sets the new UUID of the user.
	 * 
	 * @param id
	 *            Unique internal id of the user.
	 */
	public final void setId(final String id) {
		this.id = id;
	}

	/**
	 * Appends all properties to the builder.
	 * 
	 * @param builder
	 *            Builder to append key/values.
	 */
	protected void appendRegisterUserCommandResult(final ToStringBuilder builder) {
		builder.append("id", id);
	}

	@Override
	public final String toString() {
		final ToStringBuilder builder = new ToStringBuilder(this);
		appendAbstractCommandResult(builder);
		appendRegisterUserCommandResult(builder);
		return builder.toString();
	}

}
