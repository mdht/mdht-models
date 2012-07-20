/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedures Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This section defines all interventional, surgical, diagnostic, or therapeutic procedures or treatments pertinent to the patient historically at the time the document is generated. The section is intended to include notable procedures, but can contain all procedures for the period of time being summarized. The common notion of "procedure" is broader than that specified by the HL7 Version 3 Reference Information Model (RIM). Therefore this section contains procedure templates represented with three RIM classes: Act. Observation, and Procedure. Procedure act is for procedures the alter that physical condition of a patient (Splenectomy). Observation act is for procedures that result in new information about a patient but do not cause physical alteration (EEG). Act is for all other types of procedures (dressing change).
 * The length of an encounter is documented in the documentationOf/encompassingEncounter/effectiveTime and length of service in documentationOf/ServiceEvent/effectiveTime.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProceduresSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProceduresSectionTemplateId ProceduresSectionHasProcedureActivity ProceduresSectionTitle ProceduresSectionEntriesOptionalCode ProceduresSectionText' templateId.root='2.16.840.1.113883.10.20.22.2.7.1' title.mixed='Procedures' code.code='47519-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='History of procedures'"
 * @generated
 */
public interface ProceduresSection extends ProceduresSectionEntriesOptional {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->exists(a : cda::Act | a.oclIsKindOf(consol::ProcedureActivityAct)) or self.getObservations()->exists(o : cda::Observation | o.oclIsKindOf(consol::ProcedureActivityObservation)) or self.getProcedures()->exists(p : cda::Procedure | p.oclIsKindOf(consol::ProcedureActivityProcedure))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->exists(a : cda::Act | a.oclIsKindOf(consol::ProcedureActivityAct)) or self.getObservations()->exists(o : cda::Observation | o.oclIsKindOf(consol::ProcedureActivityObservation)) or self.getProcedures()->exists(p : cda::Procedure | p.oclIsKindOf(consol::ProcedureActivityProcedure))'"
   * @generated
   */
	boolean validateProceduresSectionHasProcedureActivity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Procedures')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = \'Procedures\')'"
   * @generated
   */
	boolean validateProceduresSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
   * @generated
   */
	boolean validateProceduresSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ProceduresSection init();
} // ProceduresSection
