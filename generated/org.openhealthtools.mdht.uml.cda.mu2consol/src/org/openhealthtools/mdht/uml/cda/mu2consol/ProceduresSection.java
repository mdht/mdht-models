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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Procedures Section</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getProceduresSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProceduresSectionEntriesOptionalTemplateId' templateId.root='2.16.840.1.113883.10.20.22.2.7.1' constraints.validation.info='ProceduresSectionProcedureActivityProcedure'"
 * @generated
 */
public interface ProceduresSection extends
		org.openhealthtools.mdht.uml.cda.consol.ProceduresSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getProcedures()->select(procedure : cda::Procedure | not
	 * procedure.oclIsUndefined() and
	 * procedure.oclIsKindOf(mu2consol::ProcedureActivityProcedure
	 * )).oclAsType(mu2consol::ProcedureActivityProcedure) <!-- end-model-doc
	 * -->
	 * 
	 * @model kind="operation" required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(mu2consol::ProcedureActivityProcedure)).oclAsType(mu2consol::ProcedureActivityProcedure)'"
	 * @generated
	 */
	EList<ProcedureActivityProcedure> getMu2consolProcedureActivityProcedures();

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public ProceduresSection init();

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public ProceduresSection init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProceduresSection
