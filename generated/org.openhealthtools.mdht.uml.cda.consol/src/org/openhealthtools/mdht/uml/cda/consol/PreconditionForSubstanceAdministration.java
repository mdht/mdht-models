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

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.Precondition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precondition For Substance Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPreconditionForSubstanceAdministration()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PreconditionForSubstanceAdministrationTemplateId PreconditionForSubstanceAdministrationCriterion' templateId.root='2.16.840.1.113883.10.20.22.4.25' constraints.validation.warning='PreconditionForSubstanceAdministrationCriterionCode PreconditionForSubstanceAdministrationCriterionValue' constraints.validation.info='PreconditionForSubstanceAdministrationCriterionText'"
 * @generated
 */
public interface PreconditionForSubstanceAdministration extends Precondition {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.criterion.oclIsUndefined() implies (not self.criterion.code.oclIsUndefined() or self.criterion.code.isNullFlavorDefined())'"
	* @generated
	*/
	boolean validatePreconditionForSubstanceAdministrationCriterionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.criterion.oclIsUndefined() implies not self.criterion.text.oclIsUndefined()'"
	* @generated
	*/
	boolean validatePreconditionForSubstanceAdministrationCriterionText(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.criterion.value.oclIsUndefined() or self.criterion.value.isNullFlavorUndefined()) implies (self.criterion.value.oclIsTypeOf(datatypes::CD))'"
	* @generated
	*/
	boolean validatePreconditionForSubstanceAdministrationCriterionValue(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.25\')'"
	* @generated
	*/
	boolean validatePreconditionForSubstanceAdministrationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.criterion->one(criterion : cda::Criterion | not criterion.oclIsUndefined() and criterion.oclIsKindOf(rim::Act))'"
	* @generated
	*/
	boolean validatePreconditionForSubstanceAdministrationCriterion(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PreconditionForSubstanceAdministration init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public PreconditionForSubstanceAdministration init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PreconditionForSubstanceAdministration
