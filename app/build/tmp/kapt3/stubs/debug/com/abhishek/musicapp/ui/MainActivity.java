package com.abhishek.musicapp.ui;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0014J\b\u0010\u0013\u001a\u00020\u000fH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/abhishek/musicapp/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "homeViewModel", "Lcom/abhishek/musicapp/ui/viewmodels/HomeViewModel;", "getHomeViewModel", "()Lcom/abhishek/musicapp/ui/viewmodels/HomeViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "mediaViewModel", "Lcom/abhishek/musicapp/ui/viewmodels/MusicViewModel;", "getMediaViewModel", "()Lcom/abhishek/musicapp/ui/viewmodels/MusicViewModel;", "mediaViewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onStop", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy homeViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy mediaViewModel$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    private final com.abhishek.musicapp.ui.viewmodels.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    private final com.abhishek.musicapp.ui.viewmodels.MusicViewModel getMediaViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    protected void onStop() {
    }
}