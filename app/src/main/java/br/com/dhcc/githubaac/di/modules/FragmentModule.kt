package br.com.dhcc.githubaac.di.modules

import br.com.dhcc.githubaac.ui.userprofile.UserProfileFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    abstract fun contributeUserProfileFragment(): UserProfileFragment
}