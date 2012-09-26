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
package org.openhealthtools.mdht.uml.cda.phcr.hib;

import java.lang.Iterable;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signs And Symptoms</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.hib.HibPackage#getHibSignsAndSymptoms()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HibSignsAndSymptomsTemplateId' templateId.root='2.16.840.1.113883.10.20.15.3.135'"
 * @generated
 */
public interface HibSignsAndSymptoms extends SignsAndSymptomsObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibSignsAndSymptoms init();

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HibSignsAndSymptoms init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HibSignsAndSymptoms
