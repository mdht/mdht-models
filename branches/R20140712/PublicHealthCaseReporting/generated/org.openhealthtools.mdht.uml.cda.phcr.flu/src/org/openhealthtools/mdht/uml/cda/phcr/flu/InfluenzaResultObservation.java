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
package org.openhealthtools.mdht.uml.cda.phcr.flu;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.ResultObservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influenza Result Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage#getInfluenzaResultObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='InfluenzaResultObservationTemplateId InfluenzaResultObservationCode' templateId.root='2.16.840.1.113883.10.20.15.3.81' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' interpretationCode.codeSystem='2.16.840.1.113883.6.96' interpretationCode.codeSystemName='SNOMEDCT' constraints.validation.warning='InfluenzaResultObservationInterpretationCode'"
 * @generated
 */
public interface InfluenzaResultObservation extends ResultObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and not value.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateInfluenzaResultObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (self.interpretationCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = element.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '82334004' or value.code = 'PLR1' or value.code = 'PLR3' or value.code = 'PLR19' or value.code = '407479009' or value.code = '442352004' or value.code = '407480007' or value.code = '260385009')))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (self.interpretationCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = element.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'82334004\' or value.code = \'PLR1\' or value.code = \'PLR3\' or value.code = \'PLR19\' or value.code = \'407479009\' or value.code = \'442352004\' or value.code = \'407480007\' or value.code = \'260385009\')))'"
	 * @generated
	 */
	boolean validateInfluenzaResultObservationInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaResultObservation init();

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InfluenzaResultObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // InfluenzaResultObservation
