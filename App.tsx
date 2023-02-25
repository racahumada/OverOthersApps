/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from 'react';
import {StyleSheet, Text, View, NativeModules, Button} from 'react-native';


function App() {
  const {WidgetModule} = NativeModules;
  return (
    <View style={styles.container}>
      <Text>Teste</Text>
      <Button
        title="teste"
        onPress={() => WidgetModule.createWidget('teste')}
      />
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
