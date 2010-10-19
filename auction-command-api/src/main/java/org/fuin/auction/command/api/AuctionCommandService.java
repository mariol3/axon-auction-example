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

/**
 * Service for sending commands to the command server.
 */
public interface AuctionCommandService {

	/**
	 * Sends a command to the server.
	 * 
	 * @param command
	 *            Command.
	 * @param <RESULT>
	 *            Type of the result that depends on the command.
	 * 
	 * @return Result.
	 */
	public <RESULT extends AbstractCommandResult<RESULT>> RESULT send(Command<RESULT> command);

}
