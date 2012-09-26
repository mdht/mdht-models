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
package org.openhealthtools.mdht.uml.cda.phcr.hepb;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage#getAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationTemplateId AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationNegationInd AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValue AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCode' templateId.root='2.16.840.1.113883.10.20.15.3.28' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' constraints.validation.warning='AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEffectiveTime'"
 * @generated
 */
public interface AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation extends SocialHistoryObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.negationInd.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.negationInd.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '160592001' or value.code = '32911000' or value.code = '45361006' or value.code = '226034001' or value.code = '413096007' or value.code = '55211-7' or value.code = '228395002')))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'160592001\' or value.code = \'32911000\' or value.code = \'45361006\' or value.code = \'226034001\' or value.code = \'413096007\' or value.code = \'55211-7\' or value.code = \'228395002\')))'"
	 * @generated
	 */
	boolean validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.code = \'ASSERTION\' and value.codeSystem = \'2.16.840.1.113883.5.4\')'"
	 * @generated
	 */
	boolean validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation
