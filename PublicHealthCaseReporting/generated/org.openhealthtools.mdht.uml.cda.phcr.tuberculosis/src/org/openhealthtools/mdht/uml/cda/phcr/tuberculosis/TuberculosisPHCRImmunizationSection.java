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
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PHCR Immunization Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage#getTuberculosisPHCRImmunizationSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.15.2.23' constraints.validation.error='TuberculosisPHCRImmunizationSectionTemplateId TuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration'"
 * @generated
 */
public interface TuberculosisPHCRImmunizationSection extends ImmunizationsSection {
	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(tuberculosis::TuberculosisImmunizationActivitySubstanceAdministration) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(tuberculosis::TuberculosisImmunizationActivitySubstanceAdministration) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	 * @generated
	 */
  boolean validateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(tuberculosis::TuberculosisImmunizationActivitySubstanceAdministration)).oclAsType(tuberculosis::TuberculosisImmunizationActivitySubstanceAdministration)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(tuberculosis::TuberculosisImmunizationActivitySubstanceAdministration)).oclAsType(tuberculosis::TuberculosisImmunizationActivitySubstanceAdministration)'"
	 * @generated
	 */
  EList<TuberculosisImmunizationActivitySubstanceAdministration> getTuberculosisImmunizationActivitySubstanceAdministrations();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TuberculosisPHCRImmunizationSection init();
} // TuberculosisPHCRImmunizationSection
