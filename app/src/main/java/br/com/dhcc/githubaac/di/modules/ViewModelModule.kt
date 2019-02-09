package br.com.dhcc.githubaac.di.modules

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import br.com.dhcc.githubaac.di.key.ViewModelKey
import br.com.dhcc.githubaac.ui.userprofile.UserProfileViewModel
import br.com.dhcc.githubaac.util.viewmodel.FactoryViewModel
import dagger.Binds
import dagger.Module import dagger.multibindings.IntoMap

@Module abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(UserProfileViewModel::class)
    abstract fun bindUserProfileViewModel(repoViewModel: UserProfileViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: FactoryViewModel): ViewModelProvider.Factory }