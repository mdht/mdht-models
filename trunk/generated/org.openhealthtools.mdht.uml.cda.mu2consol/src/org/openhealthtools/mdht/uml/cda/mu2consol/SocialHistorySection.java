/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Social History Section</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getSocialHistorySection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SocialHistorySectionTemplateId MU2CONSOLSocialHistorySectionSmokingStatusObservation' templateId.root='2.16.840.1.113883.10.20.22.2.17'"
 * @generated
 */
public interface SocialHistorySection extends
		org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(mu2consol::SmokingStatusObservation))'"
   * @generated
   */
	boolean validateMU2CONSOLSocialHistorySectionSmokingStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not
	 * observation.oclIsUndefined() and
	 * observation.oclIsKindOf(mu2consol::SmokingStatusObservation
	 * )).oclAsType(mu2consol::SmokingStatusObservation) <!-- end-model-doc -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(mu2consol::SmokingStatusObservation)).oclAsType(mu2consol::SmokingStatusObservation)'"
	 * @generated
	 */
	EList<SmokingStatusObservation> getMu2consolSmokingStatusObservations();

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public SocialHistorySection init();

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public SocialHistorySection init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // SocialHistorySection
