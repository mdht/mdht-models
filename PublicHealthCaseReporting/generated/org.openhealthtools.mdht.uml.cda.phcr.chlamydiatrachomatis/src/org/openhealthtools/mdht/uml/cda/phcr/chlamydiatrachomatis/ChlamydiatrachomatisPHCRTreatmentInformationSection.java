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
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PHCR Treatment Information Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This should be constrained to the Medication given, which is medication treatment.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage#getChlamydiatrachomatisPHCRTreatmentInformationSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ChlamydiatrachomatisPHCRTreatmentInformationSectionTemplateId ChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct' templateId.root='2.16.840.1.113883.10.20.15.2.40'"
 * @generated
 */
public interface ChlamydiatrachomatisPHCRTreatmentInformationSection extends PhcrTreatmentInformationSection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisTherapeuticRegimenAct))'"
   * @generated
   */
	boolean validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisTherapeuticRegimenAct))->asSequence()->any(true).oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisTherapeuticRegimenAct)'"
   * @generated
   */
	ChlamydiatrachomatisTherapeuticRegimenAct getChlamydiatrachomatisTherapeuticRegimenAct();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ChlamydiatrachomatisPHCRTreatmentInformationSection init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChlamydiatrachomatisPHCRTreatmentInformationSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ChlamydiatrachomatisPHCRTreatmentInformationSection
