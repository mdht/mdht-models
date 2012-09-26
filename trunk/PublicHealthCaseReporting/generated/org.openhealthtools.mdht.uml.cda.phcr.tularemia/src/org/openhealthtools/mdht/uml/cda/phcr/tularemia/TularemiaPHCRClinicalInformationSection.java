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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia;

import java.lang.Iterable;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tularemia PHCR Clinical Information Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage#getTularemiaPHCRClinicalInformationSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='TularemiaPHCRClinicalInformationSectionTemplateId TularemiaPHCRClinicalInformationSectionTularemiaCaseObservation' templateId.root='2.16.840.1.113883.10.20.15.2.19'"
 * @generated
 */
public interface TularemiaPHCRClinicalInformationSection extends PhcrClinicalInformationSection
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(tularemia::TularemiaCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(tularemia::TularemiaCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)'"
	 * @generated
	 */
  boolean validateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tularemia::TularemiaCaseObservation))->asSequence()->any(true).oclAsType(tularemia::TularemiaCaseObservation)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(tularemia::TularemiaCaseObservation))->asSequence()->any(true).oclAsType(tularemia::TularemiaCaseObservation)'"
	 * @generated
	 */
  TularemiaCaseObservation getTularemiaCaseObservation();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TularemiaPHCRClinicalInformationSection init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TularemiaPHCRClinicalInformationSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // TularemiaPHCRClinicalInformationSection
