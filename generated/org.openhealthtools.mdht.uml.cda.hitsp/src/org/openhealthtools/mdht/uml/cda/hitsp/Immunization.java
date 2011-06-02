/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage#getImmunization()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation code.codeSystem='2.16.840.1.113883.12.292' templateId.root='2.16.840.1.113883.3.88.11.83.13' constraints.validation.error='HITSPImmunizationTemplateId HITSPImmunizationRefusalReason ImmunizationCode' code.codeSystemName='Vaccines administered (CVX)'"
 * @generated
 */
public interface Immunization extends org.openhealthtools.mdht.uml.cda.ihe.Immunization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::RSON, ccd::ProblemAct)->exists(pa : ccd::ProblemAct | not pa.oclIsUndefined() and pa.code.codeSystem = '2.16.840.1.113883.1.11.19717')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::RSON, ccd::ProblemAct)->exists(pa : ccd::ProblemAct | not pa.oclIsUndefined() and pa.code.codeSystem = \'2.16.840.1.113883.1.11.19717\')'"
	 * @generated
	 */
	boolean validateHITSPImmunizationRefusalReason(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.13')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.88.11.83.13\')'"
	 * @generated
	 */
	boolean validateHITSPImmunizationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Immunization init();
} // Immunization
