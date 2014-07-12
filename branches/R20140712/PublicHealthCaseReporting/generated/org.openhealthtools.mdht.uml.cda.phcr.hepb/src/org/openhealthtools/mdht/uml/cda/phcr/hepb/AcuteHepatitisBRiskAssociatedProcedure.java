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
import org.openhealthtools.mdht.uml.cda.Procedure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acute Hepatitis BRisk Associated Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage#getAcuteHepatitisBRiskAssociatedProcedure()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AcuteHepatitisBRiskAssociatedProcedureTemplateId AcuteHepatitisBRiskAssociatedProcedureClassCode AcuteHepatitisBRiskAssociatedProcedureCode AcuteHepatitisBRiskAssociatedProcedureMoodCode AcuteHepatitisBRiskAssociatedProcedureStatusCode' templateId.root='2.16.840.1.113883.10.20.15.3.31' classCode='PROC' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' moodCode='EVN' statusCode.code='completed' constraints.validation.warning='AcuteHepatitisBRiskAssociatedProcedureEffectiveTime'"
 * @generated
 */
public interface AcuteHepatitisBRiskAssociatedProcedure extends Procedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.31')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.15.3.31\')'"
	 * @generated
	 */
	boolean validateAcuteHepatitisBRiskAssociatedProcedureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClass::PROC
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClass::PROC'"
	 * @generated
	 */
	boolean validateAcuteHepatitisBRiskAssociatedProcedureClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '44868003' or value.code = '302497006' or value.code = '14152002' or value.code = '177594004' or value.code = '200849007' or value.code = '428898005' or value.code = '6712008' or value.code = '428324008' or value.code = '428985000' or value.code = '118817003' or value.code = '85921004' or value.code = '387713003' or value.code = '14792009' or value.code = '116859006' or value.code = '77465005'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'44868003\' or value.code = \'302497006\' or value.code = \'14152002\' or value.code = \'177594004\' or value.code = \'200849007\' or value.code = \'428898005\' or value.code = \'6712008\' or value.code = \'428324008\' or value.code = \'428985000\' or value.code = \'118817003\' or value.code = \'85921004\' or value.code = \'387713003\' or value.code = \'14792009\' or value.code = \'116859006\' or value.code = \'77465005\'))'"
	 * @generated
	 */
	boolean validateAcuteHepatitisBRiskAssociatedProcedureCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentProcedureMood::EVN
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentProcedureMood::EVN'"
	 * @generated
	 */
	boolean validateAcuteHepatitisBRiskAssociatedProcedureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \r\nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \r\nvalue.code = \'completed\')'"
	 * @generated
	 */
	boolean validateAcuteHepatitisBRiskAssociatedProcedureStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAcuteHepatitisBRiskAssociatedProcedureEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcuteHepatitisBRiskAssociatedProcedure init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AcuteHepatitisBRiskAssociatedProcedure init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AcuteHepatitisBRiskAssociatedProcedure
