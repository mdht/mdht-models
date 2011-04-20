/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.domain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Treating Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getTreatingProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TreatingProvider extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssignedEntity toCDAType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This identifier SHALL be the identifier of one of the providers listed in the healthcare providers module.
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EList<II> getTreatingProviderIDs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>SHALL</b> contain at least one [1..*] <tt><b>id</b></tt> (C83-[DE-7.05-CDA-2])</p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	TreatingProvider addTreatingProviderID(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreatingProvider init();
} // TreatingProvider
