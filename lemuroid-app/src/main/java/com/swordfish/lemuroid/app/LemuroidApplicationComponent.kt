/*
 * RetrogradeApplicationComponent.kt
 *
 * Copyright (C) 2017 Retrograde Project
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.swordfish.lemuroid.app

import com.swordfish.lemuroid.lib.game.GameSaveWorker
import com.swordfish.lemuroid.lib.injection.AndroidWorkerInjectionModule
import com.swordfish.lemuroid.lib.injection.PerApp
import com.swordfish.lemuroid.lib.library.LibraryIndexWork
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [
    AndroidSupportInjectionModule::class,
    AndroidWorkerInjectionModule::class,
    LemuroidApplicationModule::class,
    GameSaveWorker.Module::class,
    LibraryIndexWork.Module::class
    // GDriveApplicationModule::class,
    // WebDavApplicationModule::class,
])
@PerApp
interface LemuroidApplicationComponent : AndroidInjector<LemuroidApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<LemuroidApplication>()
}