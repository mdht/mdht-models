/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.toc.domain;

import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visible Implanted Medical Devices Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The visible implanted medical devices section shall contain a description of the medical
 * devices apparent on physical exam that have been inserted into the patient, whether
 * internal or partially external.
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.IVisibleImplantedMedicalDevicesSection#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getVisibleImplantedMedicalDevicesSection()
 * @generated
 */
public interface IVisibleImplantedMedicalDevicesSection {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Section)
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getVisibleImplantedMedicalDevicesSection_CDAType()
	 * @generated
	 */
	Section getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IVisibleImplantedMedicalDevicesSection#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Section value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ihe::VisibleImplantedMedicalDevicesSection::problemEntry.
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::ProblemEntry))->asSequence()->first().oclAsType(domain::ProblemEntry)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry getProblemEntry();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Visible Implanted Medical Devices Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Problem Entry (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.5).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IProblemEntry withProblemEntry();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Visible Implanted Medical Devices Section MAY contain zero or one [0..1] entry, such that Contains exactly one [1..1] Problem Entry (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.5).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IVisibleImplantedMedicalDevicesSection setProblemEntry(IProblemEntry value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVisibleImplantedMedicalDevicesSection init();
} // IVisibleImplantedMedicalDevicesSection
