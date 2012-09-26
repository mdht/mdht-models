/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.pertussis;

import java.lang.Iterable;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signs And Symptoms Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage#getPertussisSignsAndSymptomsObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PertussisSignsAndSymptomsObservationTemplateId PertussisSignsAndSymptomsObservationValue PertussisSignsAndSymptomsObservationValueP' templateId.root='2.16.840.1.113883.10.20.15.3.66' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' constraints.validation.dependOn.PertussisSignsAndSymptomsObservationValue='PertussisSignsAndSymptomsObservationValueP'"
 * @generated
 */
public interface PertussisSignsAndSymptomsObservation extends SignsAndSymptomsObservation {
	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())'"
	 * @generated
	 */
  boolean validatePertussisSignsAndSymptomsObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '49727002' or value.code = '284523002' or value.code = '60537006' or value.code = '43025008' or value.code = '422400008' or value.code = '424580008' or value.code = '1023001' or value.code = '3415004' or value.code = '233604007' or value.code = '70995007' or value.code = '91175000' or value.code = '44186003' or value.code = '405737000' or value.code = '304213008' or value.code = '76067001' or value.code = '60119000' or value.code = '267102003' or value.code = '81308009')))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'49727002\' or value.code = \'284523002\' or value.code = \'60537006\' or value.code = \'43025008\' or value.code = \'422400008\' or value.code = \'424580008\' or value.code = \'1023001\' or value.code = \'3415004\' or value.code = \'233604007\' or value.code = \'70995007\' or value.code = \'91175000\' or value.code = \'44186003\' or value.code = \'405737000\' or value.code = \'304213008\' or value.code = \'76067001\' or value.code = \'60119000\' or value.code = \'267102003\' or value.code = \'81308009\')))'"
	 * @generated
	 */
  boolean validatePertussisSignsAndSymptomsObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertussisSignsAndSymptomsObservation init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PertussisSignsAndSymptomsObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PertussisSignsAndSymptomsObservation
