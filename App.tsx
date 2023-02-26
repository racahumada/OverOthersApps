/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from 'react';
import {StyleSheet, Text, View, NativeModules, Button} from 'react-native';
import {enterPictureInPictureMode} from 'react-native-enable-pip-in-android';

function App() {
  const {WidgetModule} = NativeModules;

  function pipHandler() {
    enterPictureInPictureMode();
  }

  return (
    <View style={styles.container}>
      <Text>Teste</Text>
      <Button title="teste" onPress={() => pipHandler()} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});

export default App;
