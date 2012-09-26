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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acute Hepatitis BImmunization Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage#getAcuteHepatitisBImmunizationSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AcuteHepatitisBImmunizationSectionTemplateId AcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivity' templateId.root='2.16.840.1.113883.10.20.15.2.9'"
 * @generated
 */
public interface AcuteHepatitisBImmunizationSection extends ImmunizationsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(hepb::AcuteHepatitisBImmunizationActivity) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(hepb::AcuteHepatitisBImmunizationActivity) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	 * @generated
	 */
	boolean validateAcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(hepb::AcuteHepatitisBImmunizationActivity)).oclAsType(hepb::AcuteHepatitisBImmunizationActivity)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(hepb::AcuteHepatitisBImmunizationActivity)).oclAsType(hepb::AcuteHepatitisBImmunizationActivity)'"
	 * @generated
	 */
	EList<AcuteHepatitisBImmunizationActivity> getAcuteHepatitisBImmunizationActivities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcuteHepatitisBImmunizationSection init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AcuteHepatitisBImmunizationSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AcuteHepatitisBImmunizationSection
